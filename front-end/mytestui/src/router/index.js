import {createRouter, createWebHashHistory} from 'vue-router';
import systemfunction from "@/views/systemfunction.vue";
import register from "@/views/register.vue"
import login from '@/views/login.vue'
import systemoverview  from "@/views/systemoverview.vue";
import applicationinquiry from "@/views/applicationinquiry.vue";
import index from '@/views/index.vue'
import filterclassroom from "@/components/Main/form/FilterClassroom_from.vue";
import test1 from "@/test/test1.vue"
import applyUser from "@/components/Main/form/ApplyUser.vue";
import auditUser from "@/components/Main/form/AuditUser.vue";
import verifyUser from "@/components/Main/form/VerifyUser.vue";
import auditUserShow from "@/components/Main/form/AuditUserShow.vue";
import privateApplication from "@/components/Main/form/PrivateApplication.vue";
import test2 from "@/test/test2.vue";
import test3 from "@/test/test3.vue";
import kjsInput from "@/components/Main/kongjiaoshi/KjsInput.vue";
import kjsOutput from "@/components/Main/kongjiaoshi/KjsOutput.vue";
import User from "@/views/User.vue";
import passWordReset from "@/views/passWordReset.vue";
import test4 from "@/test/test4.vue";
import test5 from "@/test/test5.vue";
import axiosTest from "@/test/axiosTest.vue";
// import users from "@/pages/users.vue";


//将路由暴露出来
const routes = [
  {
    path: '/index',
    name: 'index',
    component: index
  },
  {
    path: '/systemfunction',
    name: 'systemfunction',
    component:systemfunction
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    // meta: { showNav: false, showAside: false}

  },
  {
    path: '/login',
    name: 'login',
    component: login,
    // meta: { showNav: false, showAside: false}
  },
  {
    path: '/systemoverview',
    name: 'systemoverview',
    component: systemoverview
  },
  {
    path: '/applicationinquiry',
    name: 'applicationinquiry',
    component: applicationinquiry
  },
  {
    path: '/filterclassroom',
    name: 'filterclassroom',
    component: filterclassroom
  },
  {
    path: '/test1',
    name: 'test1',
    component: test1
  },
  {
    path: '/applyuser',
    name: 'applyuser',
    component: applyUser
  },
  {
    path: '/audituser',
    name: 'audituser',
    component: auditUser
  },
  {
    path: '/verifyuser',
    name: 'verifyuser',
    component: verifyUser
  },
  {
    path: '/auditusershow',
    name: 'auditusershow',
    component: auditUserShow
  },
  {
    path: '/privateapplication',
    name: 'privateapplication',
    component: privateApplication
  },
  {
    path:'/test2',
    name:'test2',
    component: test2
  },
  {
    path: "/test3",
    name: "test3",
    component: test3
  },
  {
    path: "/kjsinput",
    name: "kjsinput",
    component: kjsInput
  },
  {
    path: "/kjsoutput",
    name: "kjsoutput",
    component: kjsOutput
  },
  {
    path: "/user",
    name: "user",
    component: User
  },
  {
    path: "/passwordreset",
    name: "passwordreset",
    component: passWordReset
  },
  {
    path:"/test4",
    name:"test4",
    component: test4
  },
  {
    path:'/test5',
    name:'test5',
    component: test5
  },
  {
    path: "/axiosTest",
    name: "axiosTest",
    component: axiosTest
  },
  {
    path: "/",
    redirect:"/login"
  }
  // {
  //   path: "/users",
  //   name: "users",
  //   component: users
  // }

];
//  创建一个路由器，History()模式
const router = createRouter({
  history: createWebHashHistory(),
  routes:routes
});

export default router
