<template>
  <div class="panel panel-default">
    <div class="container">
      <h2>학생 등록</h2>         
      <table id='table_1' class="table table-bordered">
        <tbody>
          <tr>
            <td>이름</td>
            <td><input class="form-control" id="name" type="text"></td>
          </tr>
          <tr>
            <td>학번</td>
            <td><input class="form-control" id="stu_num" type="text"></td>
          </tr>
          <tr>
            <td>전화번호</td>
            <td><input class="form-control" id="phone_num1" type="text"> </td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Student_form',
  data () {
    return {
      msg: 'Student_form'
    }
  }
}
</script>
<style>
#table_1{
  width: 30%;
  margin-left: 33%;
  margin-top: 30px;

}
</style>