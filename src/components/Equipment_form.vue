<template>
  <div class="panel panel-default">
    <div class="container">
      <h2>장비 등록</h2>         
      <table id='table_1' class="table table-bordered">
        <tbody>
          <tr>
            <td>장비 명</td>
            <td><input class="form-control" id="name" type="text" v-model="postEq_name"></td>
          </tr>
          <tr>
            <td>종류</td>
            <td> <select id="company" class="form-control" v-model="postType">
                    <option>-----선택-----</option>
                    <option>모니터</option>
                    <option>마우스</option>
                    <option>키보드</option>
      </select> </td>
          </tr>
          <tr>
            <td>Serial Number</td>
            <td><input class="form-control" id="phone_num1" type="text" v-model="postS_num"> </td>
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
      postEq_name: '',
      postType: '',
      postS_num: '',
      errors: []
    }
  },
methods: {
   postPost() {
    axios.post(`http://localhost:8080/equipments`, {
      eq_name: this.postEq_name,
      type: this.postType,
      s_num: this.postS_num
    })
    .then(response => {})
    .catch(e => {
      this.errors.push(e)
    })
      window.location.href="http://localhost:8081/#/Equipment";
      alert("등록되었습니다.");
  }
}
  // Pushes posts to the server when called.
 
}
</script>
<style>
#table_1{
  width: 30%;
  margin-left: 33%;
  margin-top: 30px;

}
</style>