// import axios from 'axios'
//
// //使用axios下面的create([config])方法创建axios实例，其中config参数为axios最基本的配置信息。
// const API = axios.create({
//     baseURL:'http://localhost:8089',
//     timeout: 3000
// })
// API.interceptors.request.use(function (config) {
//     // 在发送请求之前做些什么
//     const token=localStorage.getItem("token")
//     config.headers.Authorization=token;
//     return config;
// }, function (error) {
//     // 对请求错误做些什么
//     return Promise.reject(error);
// });
//
// // 添加响应拦截器
// API.interceptors.response.use(function (response) {
//     // 对响应数据做点什么
//     return response;
// }, function (error) {
//     // 对响应错误做点什么
//     return Promise.reject(error);
// });
// export default API