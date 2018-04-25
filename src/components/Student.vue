<template>
  <div class="panel panel-default">
    <h2>학생 리스트
    <a href="#/Student_form" class="btn btn-info" role="button" id ='create'>등록</a></h2>
    <div class="panel-body">
      
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
</style>
