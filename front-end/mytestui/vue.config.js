const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
})
module.exports = {
  devServer: {
    port: 8099,
    proxy:{
    /*匹配所有以'/api'为开头的请求路径*/
      '/api':{
        target: 'http://localhost:8090', //代理目标的基础路径
        changeOrigin: true,
        pathRewrite:{
          '^/api':''
        },
        ws: true,
      }
    }
  }
}
