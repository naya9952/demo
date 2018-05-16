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
       <tbody v-if="equipments && equipments.length">
          <tr v-for="post in equipments">
            <td>{{post.eq_name}}</td>
            <td>{{post.type}}</td>
            <td>{{post.s_num}}</td>
          </tr>
        </tbody>
      </table>   
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'Equipment',
  data() {
    return {
      equipments: [],
      errors: []
    }
  },

  created() {
    axios.get(`http://localhost:8080/equipments`)
    .then(response => {
      this.equipments = response.data._embedded.equipments
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
#table_2{
  width: 70%;
  margin-left: 15%

}
</style>