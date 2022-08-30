package banch.task.company.VTB_Tasks;

/*

Ваше Spring приложение падает при запуске:

Caused by:
org.springframework.beans.factory.BeanCreationException: Could not
autowire field: private ru.sbrf.app.Utils
ru.sbrf.app.handlers.CreateHandler.utils; nested exception is
org.springframework.beans.factory.NoUniqueBeanDefinitionException:
No qualifying bean of type [ru.sbrf.app.Utils] is defined:
expected single matching bean but found 2: commonUtils,customUtils

В чём может быть проблема? Как её можно решить?


Answer is lower
 */
















/*

5 В контейнере лежит два одинаковых бина и при автовайринге не может выбрать нужный бин нужного типа. В аннотации бина указываем имя или id и в @Qualifier указываем нужный бин
Доп: спросил, как еще можно исправить, сказал, что можно еще использовать @Resources


 */
