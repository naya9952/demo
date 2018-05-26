<template>
  <div class="panel panel-default">
    <div class="container">
      <h2>학생 등록</h2>         
      <table id='table_2' class="table table-bordered">
        <tbody>
          <tr>
            <td>이름</td>
            <td><input class="form-control" id="name" type="text" v-model="postName"></td>
          </tr>
          <tr>
            <td>학번</td>
            <td><input class="form-control" id="stu_num" type="text" v-model="postStu_num"></td>
          </tr>
          <tr>
            <td>Email</td>
            <td><input class="form-control" id="email" type="text" v-model="postEmail" > </td>
          </tr>
        </tbody>
      </table>
      <button v-on:click="postPost()" type="button" class="btn btn-primary">등록</button>
      <button type="button" class="btn btn-primary">취소</button>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      postName: '',
      postStu_num: '',
      postEmail: '',
      errors: []
    }
  },
methods: {
   postPost() {
    axios.post(`http://localhost:8080/members`, {
      name: this.postName,
      stu_num: this.postStu_num,
      email: this.postEmail
    })
    .then(response => {})
    .catch(e => {
      this.errors.push(e)
    })
      alert("등록되었습니다.");
      window.location.href="http://localhost:8081/#/Student"; 
    }
  }
}
</script>
<style>
#table_2{
  width: 30%;
  margin-left: 33%;
  margin-top: 30px;

}

</style>