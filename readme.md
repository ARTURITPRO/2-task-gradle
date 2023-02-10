### 1. Для запуска приложения, сначало нужно запустить генерацию библиотеки в utils/Tasks/build/build
### 2. Для публикации библиотеки нужно запустить utils/Tasks/publishing/publishToMavenLocal
### 3. Запустить multi-project/build/build
### 4. В классе core/src/main/java/ru/clevertec/core/Utils.java может возникнуть проблема импорта класса StringUtils,
###    можно удалить строку "import utils.StringUtils;" и нажать на автоимпорт класса "StringUtils."
### 5. Для запуска плагина, смотрите файл  readme.md в "clevertec-plugin-file-image"