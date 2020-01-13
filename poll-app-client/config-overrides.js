const { injectBabelPlugin } = require('react-app-rewired');
const rewireLess = require('react-app-rewire-less');


// const {
//     override,
//     fixBabelImports,
//     addLessLoader,
// } = require("customize-cra");
//
//
// module.exports = override(
//     fixBabelImports("import", {
//         libraryName: "antd", libraryDirectory: "es", style: true // change importing css to less
//     }),
//     addLessLoader({
//         javascriptEnabled: true,
//         modifyVars: { "@primary-color": "#1DA57A" }
//     })
// );


module.exports = function override(config, env) {
    config = injectBabelPlugin(['import', { libraryName: 'antd', style: true }], config);
    config = rewireLess.withLoaderOptions({
        modifyVars: {
            "@layout-body-background": "#FFFFFF",
            "@layout-header-background": "#0500ff",
            "@layout-footer-background": "#FFFFFF"
        },
        javascriptEnabled: true
    })(config, env);
    return config;
};