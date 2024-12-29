# cursor 提示词

### 后端提示词

请为我开发一个基于 Node.js 和Express 框架的 Todo List 后端项目。项目需要实现以下四个 RESTful API 接口：

1. 查询所有待办事项 
   - 接口名: GET /api/get-todo
   - 功能: 从数据库的'list'集合中查询并返回所有待办事项
   - 参数: 无
   - 返回: 包含所有待办事项的数组
2. 添加新的待办事项 
   - 接口名: POST /api/add-todo
   - 功能: 向'list'集合中添加新的待办事项
   - 参数: { "value": string, // 待办事项的具体内容 "isCompleted": boolean // 是否完成，默认为 false }
   - 返回: 新添加的待办事项对象，包含自动生成的唯一 id
3. 更新待办事项状态 
   - 接口名: POST /api/update-todo/
   - 功能: 根据 id 更新指定待办事项的完成状态（将 isCompleted 值取反）
   - 参数: id
   - 返回: 更新后的待办事项对象
4. 删除待办事项 
   - 接口名: POST /api/del-todo/
   - 功能: 根据 id 删除指定的待办事项
   - 参数: id
   - 返回: 删除操作的结果状态

技术要求：

1. 使用 Express 框架构建 API
2. 使用 MongoDB 作为数据库，通过 Mongoose 进行数据操作
3. 实现适当的错误处理和输入验证
4. 使用异步/等待（async/await）语法处理异步操作
5. 遵循 RESTful API 设计原则
6. 添加基本的日志记录功能

### 这里数据库连接方式要填写！！！ 

以下是数据库连接方式： 

1. 直接以当前目录作为项目根目。注意 此目录已经初始化完了nodejs项目 直接修改即可 
2. 如果需要执行命令，请暂停创建文件，让我先执行命令 

为这个项目中的所有代码写上详细注释 

### npm 安装依赖很慢请执行这行命令！！！ 

```jsx 
npm config set registry <https://registry.npmmirror.com>

```
 
### 前端提示词

请为我开发一个基于 Vue 3 的Todo List 应用。要求如下： 
 
1. 功能需求： 
   - 添加新的待办事项 
   - 标记待办事项为完成/未完成  
   - 删除待办事项
   - 统计待办事项完成度 
   - 过滤显示（全部/已完成/未完成） 
2. UI/UX 设计要求：  
   - 全屏响应式设计，适配不同设备 
   - 拥有亮色模式和夜间模式 
   - 现代化、简洁的界面风格 
   - 丰富的色彩运用，但保持整体和谐 
   - 流畅的交互动画，提升用户体验 
   - 在按钮和需要的地方添加上图标 
   - 参考灵感：结合苹果官网的设计美学 

要求：

1. 直接以当前目录作为项目根目。注意 此目录已经初始化完了vue3项目结构 直接修改即可 
2. 如果需要执行命令，请暂停创建文件，让我先执行命令 
3. 请你根据我的需要，一步一步思考，给我开发这个项目。特别是UI部分 一定要足够美观和现代化 

那这里总结一下 我们用cursor完成了前端代码的开发 我们就是发送提示词写清楚我们的需求 以及出现问题  或者想调整功能和UI 继续 用文字和他持续沟通即可。