# cursor 提示词

### 后端提示词

请为我开发一个基于 Spring Boot框架的Trival后端项目。项目需要实现以下RESTful API 接口：

#### 1. 用户登录

- **接口名**: `POST /api/user/login`

- **功能**: 普通用户通过用户名和密码登录系统。

- 参数

  : 

  ```json
  {
    "username": "string", // 用户名
    "password": "string"  // 密码
  }
  ```

- 返回

  : 

  ```json
  {
    "status": "success",
    "token": "string",    // 用户身份认证的 token
    "userId": "string",   // 用户的唯一标识 ID
    "role": "user"        // 角色标识为普通用户
  }
  ```

------

#### 2. 管理员登录

- **接口名**: `POST /api/admin/login`

- **功能**: 管理员通过用户名和密码登录系统。

- 参数

  : 

  ```json
  {
    "username": "string", // 管理员用户名
    "password": "string"  // 密码
  }
  ```

- 返回

  : 

  ```json
  {
    "status": "success",
    "token": "string",    // 管理员身份认证的 token
    "adminId": "string",  // 管理员的唯一标识 ID
    "role": "admin"       // 角色标识为管理员
  }
  ```

------

#### 3. 用户信息获取

- **接口名**: `GET /api/get-user-info`

- **功能**: 根据 token 获取当前登录用户的信息。

- 参数

  : 

  - Header 中需携带认证 token: 

    ```
    Authorization: Bearer <token>
    ```

- 返回

  : 

  ```json
  {
    "status": "success",
    "data": {
      "userId": "string",  // 用户的唯一标识 ID
      "username": "string", // 用户名
      "role": "string"     // 用户角色（user 或 admin）
    }
  }
  ```

------

#### 4. 退出登录

- **接口名**: `POST /api/logout`

- **功能**: 用户或管理员退出登录，销毁 token。

- 参数

  : 

  - Header 中需携带认证 token: 

    ```
    Authorization: Bearer <token>
    ```

- 返回

  : 

  ```json
  {
    "status": "success",
    "message": "Logout successful"
  }
  ```





技术要求：

1. 使用 Express 框架构建 API
2. 使用 MongoDB 作为数据库，通过 Mongoose 进行数据操作
3. 实现适当的错误处理和输入验证
4. 使用异步/等待（async/await）语法处理异步操作
5. 遵循 RESTful API 设计原则
6. 添加基本的日志记录功能

### 这里数据库连接方式要填写！！！

以下是数据库连接方式：

```
mysql://localhost:3306/travel
username=root
password=123456
```

1. 直接以当前目录作为项目根目。
2. 如果需要执行命令，请暂停创建文件，让我先执行命令

为这个项目中的所有代码写上详细注释

### npm 安装依赖很慢请执行这行命令！！！

```jsx
npm config set registry <https://registry.npmmirror.com>
```

### 前端提示词

请为我开发一个基于 Vue 3 的trival 应用。要求如下：

1. 功能需求： 
   
   登录功能:
   
   1、用户
   2、管理员
   
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