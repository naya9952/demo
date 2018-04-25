<template>
  <div class="panel panel-default">
    <h2>장비 리스트
    <a href="#/Equipment_form" class="btn btn-info" role="button" id ='create'>등록</a></h2>
    <div class="panel-body">
       <table id='table_2' class="table table-hover">
        <thead>
          <tr>
            <th>장비명</th>
            <th>종류</th>
            <th>Serial Number</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>TG452018AG</td>
            <td>모니터</td>
            <td>4c5cau689au</td>
          </tr>
          <tr>
            <td>CosyM936WL</td>
            <td>마우스</td>
            <td>CSY-M936ML25d</td>
          </tr>
          <tr>
            <td>TG42KB</td>
            <td>키보드</td>
            <td>2nc84kchshak2</td>
          </tr>
        </tbody>
      </table>   
    </div>
  </div>
</template>

<script>
export default {
  name: 'Equipment',
  data () {
    return {
      msg: 'Equipment'
    }
  }
}
</script>
<style>
#create {
  margin-left: 90%;
}
#table_2{
  width: 70%;
  margin-left: 15%

}
</style>