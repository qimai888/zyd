layui.define(['laytpl', 'layer', 'element', 'util'], function (exports) {
    exports('setter', {
        container: 'LAY_app' //容器ID
        , base: layui.cache.base //记录静态资源所在路径
        , views: layui.cache.base + 'tpl/' //动态模板所在目录
        , entry: 'index' //默认视图文件名
        , engine: '.html' //视图文件后缀名
        , pageTabs: true //是否开启页面选项卡功能。iframe 版推荐开启

        , name: 'layuiAdmin'
        , tableName: 'layuiAdmin' //本地存储表名
        , MOD_NAME: 'admin' //模块事件名

        , debug: true //是否开启调试模式。如开启，接口异常时会抛出异常 URL 等信息

        //自定义请求字段
        , request: {
            tokenName: false //自动携带 token 的字段名（如：access_token）。可设置 false 不携带。
        }

        //自定义响应字段
        , response: {
            statusName: 'code' //数据状态的字段名称
            , statusCode: {
                ok: 0 //数据状态一切正常的状态码
                , logout: 1001 //登录状态失效的状态码
            }
            , msgName: 'msg' //状态信息的字段名称
            , dataName: 'data' //数据详情的字段名称
        }

        //扩展的第三方模块
        , extend: [
            'echarts', //echarts 核心包
            'echartsTheme' //echarts 主题
        ]

        //主题配置
        , theme: {
            //配色方案，如果用户未设置主题，第一个将作为默认
            color: [{
                main: '#393D49' //主题色
                , selected: '#009688' //选中色
                , logo: '' //logo区域背景色
                , header: '' //头部区域背景色
                , alias: 'default' //默认别名
            }] //为了减少篇幅，更多主题此处不做列举，可直接参考 config.js

            //初始的颜色索引，对应上面的配色方案数组索引
            //如果本地已经有主题色记录，则以本地记录为优先，除非清除 LocalStorage（步骤：F12呼出调试工具→Aplication→Local Storage→选中页面地址→layuiAdmin→再点上面的X）
            // 1.0 正式版开始新增
            , initColorIndex: 0
        }
    });
});