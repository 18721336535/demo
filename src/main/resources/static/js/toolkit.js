var vue = new Vue({
    el: "#toolkit-app",
    data: {
        file: {locationid:"",location:"",locationdescription:"",address:"",fooditems:"",dayshours:"",status:""},
        fileList: [],
        fileColumns: [],
        div_heads_message:""
    },
    methods: {
        findAll: function () {
            var _this = this;
            axios.get("/getAllItems").then(function (response) {
                _this.fileList = response.data.data;
                console.log(_this.fileList);
            }).catch(function (err) {
                console.log(err);
            });
        },

        findById: function (fileid) {},
        getFileHeads: function () {},

        findDataByFiledNameAndValue: function () {
            var _this = this;
            var food = $("#search-food-id").val();
            var keyword = $("#location-key-word-id").val();
            let paramsDto = {foodName:food,locationKeyWord:keyword,coordinate:null}
            axios.post("/getDataByMultipleConditions",paramsDto).then(function (response) {
                  _this.fileList = response.data.data;
                  console.log(_this.fileList);
            }).catch(function (err) {
                  console.log(err);
            });
        },
        update: function (file) {
            var _this = this;
            _this.findAll();
        }
    },

    created(){
        this.findAll();
    }
});