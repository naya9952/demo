<template>
   <div>
      <h1 id='h1_home'>모바일소프트웨어학과 연구실 </h1>
      <h1 id='h1_home'>장비관리 시스템에 방문을 환영합니다.</h1>
      <img id='img1' src="../assets/equipment1.png" class="img-thumbnail" alt="Cinque Terre">
      <h3 id='home_h3'>보유하고 있는 장비를 관리 할 수 있습니다.</h3>
      <img id='img1' src="../assets/student1.png" class="img-thumbnail" alt="Cinque Terre">
      <h3 id='home_h3'>연구실 구성원을 관리 할 수 있습니다.</h3>
      <img id='img1' src="../assets/rent1.png" class="img-thumbnail" alt="Cinque Terre">
      <h3 id='home_h3'>장비 대여를 관리 할 수 있습니다.</h3>
  </div>
  
</template>

<script>
export default {
  name: 'Home',
  data () {
    return {
      msg: 'home'
    }
  }
}
</script>

<style>
#h1_home {
  margin-top: 50px;
  color: #2C7EC7;
}
#img1 {
  margin-top: 50px;
}
#home_h3 {
  color: #2C7EC7;
}
</style>