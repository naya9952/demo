import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Student from '@/components/Student'
import Equipment from '@/components/Equipment'
import Student_form from '@/components/Student_form'
import Equipment_form from '@/components/Equipment_form'
import Order from '@/components/Order'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/Equipment',
      name: 'Equipment',
      component: Equipment
    },
    {
      path: '/Student',
      name: 'Student',
      component: Student
    },
    {
      path: '/Student_form',
      name: 'Student_form',
      component: Student_form
    },
    {
      path: '/Equipment_form',
      name: 'Equipment_form',
      component: Equipment_form
    },
    {
      path: '/Order',
      name: 'Order',
      component: Order
    }
  ]
})
