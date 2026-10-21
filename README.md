# Sheep Farmer Lite (基础界面原型)

这是一个独立的 Android Studio 项目，启动后直接进入主界面，不包含机器码/激活码页面。

## 当前包含
- 目标羊 ID 输入框
- 开始 / 停止按钮
- 状态提示

## 重要限制
此版本只是基础界面原型。开始/停止按钮仅更新界面状态，没有连接原 APK 的自动化脚本、服务器或游戏接口，因此不具备原软件的一键操作功能。原 APK 是编译产物，无法仅凭界面自动恢复全部内部逻辑。

## 构建
使用 Android Studio 打开本目录，安装 Android SDK 35，并使用兼容的 Android Gradle Plugin 构建。首次构建需要网络下载 Gradle/Android 插件依赖。
