<template>
  <div class="panel panel-default">
    <h2>학생 리스트
    <a href="#/Student_form" class="btn btn-info" role="button" id ='create'>등록</a></h2>
    <div class="panel-body">
      <table id='table_1' class="table table-hover">
        <thead>
          <tr>
            <th>이름</th>
            <th>학번</th>
            <th>Email</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>박성민</td>
            <td>201741087</td>
            <td>naya9952@gmail.com</td>
          </tr>
          <tr>
            <td>홍길동</td>
            <td>201640175</td>
            <td>Hong@gachon.ac.kr</td>
          </tr>
        </tbody>
      </table>  
    </div>
  </div>
</template>

<script>
export default {
  name: 'Student',
  data () {
    return {
      msg: 'Student'
    }
  }
}
</script>

<style>
#create {
  margin-left: 90%;
}
#table_1{
  width: 70%;
  margin-left: 15%

}
</style>
