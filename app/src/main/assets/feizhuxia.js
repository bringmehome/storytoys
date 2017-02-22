/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};

/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {

/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId])
/******/ 			return installedModules[moduleId].exports;

/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			exports: {},
/******/ 			id: moduleId,
/******/ 			loaded: false
/******/ 		};

/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);

/******/ 		// Flag the module as loaded
/******/ 		module.loaded = true;

/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}


/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;

/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;

/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";

/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(0);
/******/ })
/************************************************************************/
/******/ ([
/* 0 */
/***/ function(module, exports, __webpack_require__) {

	var __weex_template__ = __webpack_require__(1)
	var __weex_style__ = __webpack_require__(2)
	var __weex_script__ = __webpack_require__(3)

	__weex_define__('@weex-component/b3a40a542f4bb2c2b6f8817180db4bde', [], function(__weex_require__, __weex_exports__, __weex_module__) {

	    __weex_script__(__weex_module__, __weex_exports__, __weex_require__)
	    if (__weex_exports__.__esModule && __weex_exports__.default) {
	      __weex_module__.exports = __weex_exports__.default
	    }

	    __weex_module__.exports.template = __weex_template__

	    __weex_module__.exports.style = __weex_style__

	})

	__weex_bootstrap__('@weex-component/b3a40a542f4bb2c2b6f8817180db4bde',undefined,undefined)

/***/ },
/* 1 */
/***/ function(module, exports) {

	module.exports = {
	  "type": "div",
	  "classList": [
	    "rootview"
	  ],
	  "children": [
	    {
	      "type": "div",
	      "style": {
	        "flexDirection": "row",
	        "height": 100,
	        "backgroundColor": "#fb5275",
	        "paddingLeft": 20,
	        "paddingRight": 20
	      },
	      "children": [
	        {
	          "type": "div",
	          "classList": [
	            "titleLR"
	          ],
	          "events": {
	            "click": "closeWin"
	          },
	          "children": [
	            {
	              "type": "image",
	              "attr": {
	                "src": "http://ac-rkb3roqq.clouddn.com/e94889350b6856cdb10f.png"
	              },
	              "style": {
	                "width": 20,
	                "height": 35
	              }
	            }
	          ]
	        },
	        {
	          "type": "div",
	          "style": {
	            "flex": 1,
	            "justifyContent": "center"
	          },
	          "children": [
	            {
	              "type": "text",
	              "style": {
	                "color": "#ffffff",
	                "textAlign": "center",
	                "fontSize": 36
	              },
	              "attr": {
	                "value": "飞猪侠故事机"
	              }
	            }
	          ]
	        }
	      ]
	    },
	    {
	      "type": "div",
	      "classList": [
	        "bindbox"
	      ],
	      "children": [
	        {
	          "type": "div",
	          "style": {
	            "backgroundColor": "#ffffff",
	            "borderRadius": 20,
	            "alignItems": "center",
	            "paddingBottom": 100,
	            "paddingTop": 100
	          },
	          "events": {
	            "click": "openEasyLink"
	          },
	          "children": [
	            {
	              "type": "image",
	              "attr": {
	                "src": "http://ac-rkb3roqq.clouddn.com/4f576e25639bce2c19aa.png"
	              },
	              "style": {
	                "width": 200,
	                "height": 200
	              }
	            },
	            {
	              "type": "text",
	              "style": {
	                "marginTop": 100,
	                "color": "#666666",
	                "fontSize": 30
	              },
	              "attr": {
	                "value": "帮故事机连接网络"
	              }
	            },
	            {
	              "type": "text",
	              "style": {
	                "marginTop": 50,
	                "backgroundColor": "#fb5275",
	                "borderRadius": 40,
	                "color": "#ffffff",
	                "fontSize": 30,
	                "paddingLeft": 30,
	                "paddingRight": 30,
	                "paddingTop": 20,
	                "paddingBottom": 20
	              },
	              "attr": {
	                "value": "开始联网"
	              }
	            }
	          ]
	        }
	      ]
	    }
	  ]
	}

/***/ },
/* 2 */
/***/ function(module, exports) {

	module.exports = {
	  "rootview": {
	    "backgroundColor": "#fb5275"
	  },
	  "titleLR": {
	    "justifyContent": "center",
	    "alignItems": "center"
	  },
	  "bindbox": {
	    "marginRight": 100,
	    "marginLeft": 100,
	    "paddingTop": 100
	  }
	}

/***/ },
/* 3 */
/***/ function(module, exports) {

	module.exports = function(module, exports, __weex_require__){'use strict';

	var navigator = __weex_require__('@weex-module/navigator');
	module.exports = {
		methods: {
			closeWin: function closeWin() {
				var vm = this;
				var params = {
					'animated': 'true'
				};
				navigator.pop(params, function () {});
			},
			openEasyLink: function openEasyLink() {
				var URLHelper = __weex_require__('@weex-module/event');
				URLHelper.openURL("http://192.168.3.199:8081/weex_tmp/h5_render/index.js", function (ts) {
					console.log("url is open at ----- >>>>>  " + ts);
				});
			}
		}
	};}
	/* generated by weex-loader */


/***/ }
/******/ ]);