# 使用步骤

1. 创建Github仓库

   * 对仓库的操作有：
     * star
     * fork
     * watch
   * 一个git仓库对应一个开源项目，仓库管理可以：
     * 新建文件：创建、编辑、删除文件
     * 上传文件
     * 下载/克隆文件

2. 本地下载git，并创建本地仓库（同名）

   * git基本工作流程

     * 工作区***git status*** -- ***git add 文件名* **暂存区***git status*** -- ***git commit -m ”提交描述“*** git仓库

   * 设置基本信息

     * 设置用户名

       ```git config --global user.name "你的昵称"```

     * 设置邮箱

       ```git config --global user.email "你的邮箱"```

     * 查看设置

       ```
       git config user.name
       git config user.email
       git config list
       ```

   * 初始化一个新的git仓库

     * 创建一个文件夹

       ```mkdir demo```

     * 在文件夹中初始化Git仓库

       ```
       cd demo
       git init
       ```

       

3. 本地操作【Git管理本地仓库】

   * 添加文件
   * 编辑文件
   * 删除文件

   

4. 远程操作【Git管理远程仓库】：

   * 从远程仓库克隆项目

     ```
     git clone 项目地址
     ```

   * 添加远程库

     ```
     $ mkdir runoob-git-demo				# 创建测试目录
     $ cd runoob-git-demo				# 进入测试目录
     $ echo "# Git练习" >>README.md	   # 创建README.md文件并写入内容
     $ ls								# 查看目录下的内容
     
     $ git init							# 初始化
     $ git add README.md					# 添加文件
     $ git commit -m "添加README.md 文件" # 提交并备注信息
     # 提交到GitHub
     $ git remote add origin git@github.com:irisTechdom/runoob-git-demo.git   
     $ git push -u origin master
     
     $ git remote						# 查看当前配置有哪些远程仓库
     $ git remote -v
     
     $ git fetch origin					# 从远程下载新分支与数据
     $ git merge origin/master			# 把远程下载的分支与数据合并到当前所在的分支
     ```

     

   * 推送到远程仓库

     ```
     $ cat README.md						# 打开文件并修改内容
     $ touch runoob-test.txt				#添加新文件
     $ git add runoob-test.txt
     $ git commit -m "添加到远程"
     $ git push origin master			# 推送到Github
     ```

   * 在github同一个仓库上传多个项目

     ```
     复制新项目Javacode到仓库iris-studyspace
     
     $ git add .
     $ git commit -m "基本语法代码练习"
     $ git remote add origin git@github.com:irisTechdom/iris-studyspace.git
     $ git push -u origin master
     ```

     

   # 学习后完成内容

   * [x] git本地安装与基操练习
   * [x] VS code安装
   * [x] git连接github
   * [x] 添加远程仓库
   * [x] 推送到远程仓库
   * [x] 在github同一个仓库上传多个项目