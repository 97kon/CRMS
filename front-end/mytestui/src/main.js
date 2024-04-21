import { createApp } from 'vue'
// import Vue from 'vue'
import App from './App.vue'
import installElementPlus from './plugins/element'
import router from './router/index.js'
import ElementPlus from "element-plus";
import "element-plus/theme-chalk/index.css"
import {ElIcon} from "element-plus";
import axios  from "axios";
// import store from '@/store/store'
// import axios from "./axios/http.js";
import VueAxios from "vue-axios";
// import {store} from "@/store/store.js";

// const app = createApp(App)
const app = createApp(App).use(router)
installElementPlus(app)
app.mount('#app')
app.use(ElementPlus)
app.use(router)
app.component(ElIcon.name, ElIcon)
app.use(VueAxios,axios)
// app.use(store)

// 全局配置
// app.config.globalProperties.$store=store;
app.config.globalProperties.$axios=axios;
axios.defaults.baseURL = '/api'


