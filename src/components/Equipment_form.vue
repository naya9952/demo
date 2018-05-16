<template>
  <div class="panel panel-default">
    <div class="container">
      <h2>장비 등록</h2>         
      <table id='table_1' class="table table-bordered">
        <tbody>
          <tr>
            <td>장비 명</td>
            <td><input class="form-control" id="name" type="text"></td>
          </tr>
          <tr>
            <td>종류</td>
            <td> <select id="company" class="form-control">
                    <option>-----선택-----</option>
                    <option>모니터</option>
                    <option>마우스</option>
                    <option>키보드</option>
      </select> </td>
          </tr>
          <tr>
            <td>Serial Number</td>
            <td><input class="form-control" id="phone_num1" type="text"> </td>
          </tr>
        </tbody>
      </table>
      <a href="#/Equipment" class="btn btn-info" role="button" >등록</a>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Equipment_form',
  data () {
    return {
      msg: 'Equipment_form'
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