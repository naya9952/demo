<template>
  <div class="panel panel-default">
    <h2>대여 리스트
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
        <tbody v-if="members && members.length">
          <tr v-for="post in members">
            <td>{{post.name}}</td>
            <td>{{post.stu_num}}</td>
            <td>{{post.email}}</td>
          </tr>
        </tbody>
      </table>  
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'Order',
  data() {
    return {
      members: [],
      errors: []
    }
  },

  created() {
    axios.get(`http://localhost:8080/members`)
    .then(response => {
      this.members = response.data._embedded.members
    })
    .catch(e => {
      this.errors.push(e)
    })
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
