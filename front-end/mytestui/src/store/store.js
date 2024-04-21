// import { createStore } from 'vuex';
// // import Vue from 'vue'
// // import Vue from 'vue'
// // Vue.config.devtools = true
// // import Vuex from 'vuex'
// // import Vue from "@vue/cli-plugin-eslint/eslintOptions";
//
// // Vue.use(Vuex)
//
// // const store = createStore({
// //     state: {
// //         // 状态
// //         type:4,
// //     },
// //     mutations: {
// //         // 更改状态的方法
// //         setType(state, type){
// //             state.type = type
// //         }
// //     },
// //     actions: {
// //         // 异步操作
// //     },
// //     getters: {
// //         // 获取状态的方法
// //         userType(state){
// //             return state.type
// //         }
// //     },
// // });
//
// const state = {
//     userName: '',
//     type:0
// }
//
// const getters = {
//     getUserName:state => state.userName,
//     getType:state => state.type
// }
//
// const mutations = {
//     updateUserName(state, userName){
//         state.userName = userName
//     },
//     updateType(state, type){
//         state.type = type
//     }
// }
//
// const actions = {
//     setUserName({ commit }, userName) {
//         commit('updateUserName', userName)
//     },
//
//     setType({ commit }, type){
//         commit('updateType',type)
//     },
//     modules(){
//
//     }
// }
//
// export default createStore({
//     state,
//     getters,
//     mutations,
//     actions
// })
import {reactive} from "vue";

export const store = reactive({
    userName:'',
    type:'',
    count:0
})