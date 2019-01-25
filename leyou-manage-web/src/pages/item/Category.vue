<template>
  <v-card>
      <v-flex xs12 sm10>
        <v-tree url="/item/category/getCategoryByPid"
                :treeData="treeData"
                :isEdit="isEdit"
                @handleAdd="handleAdd"
                @handleEdit="handleEdit"
                @handleDelete="handleDelete"
                @handleClick="handleClick"
        />
      </v-flex>
  </v-card>
</template>

<script>
  // import {treeData} from '../../mockDB'
  export default {
    name: "category",
    data() {
      return {
        treeData: [],
        isEdit:true
      }
    },mounted(){ // 渲染后执行
      // 查询数据
      this.getDataFromServer();
    },
    methods: {
      handleAdd(node) {
        console.log("add .... ");
        console.log(node);
      },
      handleEdit(id, name) {
        console.log("edit... id: " + id + ", name: " + name)
      },
      handleDelete(id) {
        console.log("delete ... " + id)
      },
      handleClick(node) {
        console.log(node)
      },
      getDataFromServer(){
        // 从服务的加载数的方法。
        // 发起请求
        this.$http.get("/item/category/getCategoryByPid", {
          params: {
            pid:0
          }
        }).then(resp => { // 这里使用箭头函数
          this.treeData = resp.data;
        })
      }
    }
  };
</script>

<style scoped>

</style>
