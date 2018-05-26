<template>
  <div id="app">
    <img id="logo" src="./assets/logo.png">
    <div>
      <nav class="navbar navbar-inverse">
        <div id="navi" class="container-fluid">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#/">Home</a></li>
            <li><a href="#/Equipment">장비</a></li>
            <li><a href="#/Student">학생</a></li>
            <li><a href="#/Order">대여 현황</a></li>
          </ul>
        </div>
      </nav>
    </div>
    <router-view/>

    <footer id='footer1' class="page-footer font-small blue pt-4 mt-4">
      <div class="container-fluid text-center text-md-left">
        <div class="row">
            <div class="col-md-6">
                <h5 class="text-uppercase">장비 관리 시스템</h5>
                <p>가천대학교 모바일소프트웨어학과 연구실 장비 관리 시스템입니다. </p>
            </div>
            <div class="col-md-6">
                <h5 class="text-uppercase">링크</h5>
                <ul class="list-unstyled">
                        <a href="#/"> 홈 </a>|                                        
                        <a href="#/Equipment"> 장비 </a>|                  
                        <a href="#/Student"> 학생 </a>|                            
                        <a href="#/Order"> 대여 현황 </a>                
                </ul>
            </div>
        
        </div>
      </div>
      <div class="footer-copyright py-3 text-center">
        © 2018 Copyright:  Park Seong Min 201741087
      </div>
    </footer>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
 
} 
#logo {
  margin-bottom: 30px;
}
#footer1 {
  margin-top: 50px;
}
</style>
