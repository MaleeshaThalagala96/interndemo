const { injectBabelPlugin } = require('react-app-rewired');
const rewireLess = require('react-app-rewire-less');

module.exports = function override(config, env) {
    config = injectBabelPlugin(['import', { libraryName: 'antd', style: true }], config);
    config = rewireLess.withLoaderOptions({
        modifyVars: {
            "@layout-body-background": "#f6f4ff",
            "@layout-header-background": "#005e40",
            "@layout-footer-background": "#FFFFFF"
        },
        javascriptEnabled: true
    })(config, env);
    return config;
};