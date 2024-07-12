# kotlin_experimental
Репозиторий с экспериментальными проектами на языке котлин

# Шаги для создания котлин проекта
### 1 create using IDEA
- https://www.jetbrains.com/help/idea/create-your-first-kotlin-app.html#write-code
- плагины maven-surefire-plugin & maven-failsafe-plugin для тестов использовать не обязательно (закомментил)

### 2 add in dependencies "kotlin-stdlib-jdk8"
- AI recommend kotlin-stdlib-jdk8
- Обеспечивает интеграцию kotlin кода с Java-экосистемой
  - Доп инфо:
- обеспечивает совместимость с Java 8 и более новыми версиями
- позволяет использовать все возможности Java 8: лямбда-выражения, функциональные интерфейсы и потоки.
- содержит основные классы и функции, необходимые для разработки на Kotlin
- Kotlin-код может легко взаимодействовать с существующими Java-библиотеками и фреймворками.
- может использоваться для интеграции kotlin кода в уже существующие Java проекты

## Первые шаги "Hello World на котлин"
### В IDEA можно создать "kotlin class" и "kotlin file"
- оба "файла" будут с расширением *.kt , НО внутри класс запустить main метод не удастся

## Истории языков и причина их популярности
- История Java
  - Java (джава, ранее переводили как Ява, а не транскрибировалось)
    - 21января 1996г создана Джеймсом Гослингом в Oracle поглотившей Sun Microsystems
    - первое устройство запуска Java (Oak) было устройство опередившее свое время на 10 лет, устройство КарманныйПК
    - Java бывший Oak тк название "дуб" было занято, решили назвать в честь кофе
    - у Java есть персонаж duke "талисман" и тысячи библиотек
    - Релизный цикл: до 2019г Java выпукала новые версии языка не чаще чем раз в 2 года. На текущий момент новые версии выпускаются ежегодно

- История Kotlin
  - cоздан в JetBrains в 2011г
  - причина: JetBrains видели необходимость в более современном, лаконичном и безопасном языке программирования. Но при этом сохранить максимально возможную интероперабельность (совместимость) c языком Java
  - недостатки Java: Разработчики JetBrains столкнулись с рядом проблем и недостатков Java, таких как многословность, отсутствие встроенной null-безопасности, сложность в написании некоторых типов кода.
    - те изначально создавали язык под нужды JetBrains (так родился еще один java подобный язык)

- Java известна
  - высокой совместимостью со всеми её предыдущими версиями
  - долгий релизный цикл (сейчас нет), за счет чего у разработчиков было время для подготовки и переезда cвоих проектов на новую версию Java.
  - скорость работы языка, одна из самых быстрых (долго "заводится", но потом оч быстр)
  - кросплатформенный, лозунг языка "write once run anywhere" - но по факту для каждой платформы есть свой набор библиотек (написать за вечер и запустить на всех платформах не выйдет)
  - строго типизированный (добавили var для локал переменных = уже не совсем строго типизированный)
  - мультипарадигменный - поддерживает декларативный (говорим что делать, но не говорим как) и императивный подходы (говорим что делать, и говорим как это делать)
  - статическая типизация - помогает обнаруживать ошибки во время компиляции
  - код может запускаться -> интерпретируясь на лету те без копиляции
  - после компиляции файлы *.java копилируются в байт-код файлы *.class понятный для JVM _ после чего можно запаковать в *.jar (архив) артефакт
  - язык НЕ поддерживает безопасную работу с null, случаи получения null необходимо обрабатывать в явном виде (или инструментами др библиотек, аннотациями и тд)

- Kotlin известен
  - кроссплатформенность: для запуска в браузерах выполняется на JVM через транспиляцию в JavaScript, для разных платформ компилируется в нативный код
  - статическая типизация - помогает обнаруживать ошибки во время компиляции
  - null safety язык - в язык встроена поддержка для безопасной работы с null
    - так если хотим получать ошибку на этапе копиляции в случае если перменная содержит null тогда: val str: String = null
    - если НЕ хотим получать ошибку на этапе копиляции даже если переменная содержит null тогда, делаем такую переменную наллабл: val str: String? = null
  - более короткие наименования и пути для вызова методов core библиотеки языка котлин (println() - вместо System.out.println() )
    - например kotlin: val name = readln()
      - вместо java: BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); var name = reader.readLine();


## Основные различия Kotlin от Java по синтаксису кода
В конце "набора инструкций кода" в kotlin точку c запятой НЕ ставят
НЕ всё в котлин короче чем в Java
- объявление переменной
  - Java: String name = "John"; или var name = "John";
  - Kotlin: val name: String = "John" или var name = "John"
    - val - ключевое слово для объявления (immutable) НЕ изменяемых переменных/свойств
    - var - ключ слово для объъявления изменяемых переменных/свойств

Классы и наследование
  - Java: public class Person { ... }, class Student extends Person { ... }
  - Kotlin: class Person { ... }, open class Person { ... }, class Student : Person() { ... }

Поля класса
  - Java: String name = "Djon"; без значения: String name;
  - Kotlin: val name: String = "John Doe" без значения: val name: String

Методы
- Java: public int add(int a, int b) { return a + b; }
- Kotlin: fun add(a: Int, b: Int): Int { return a + b }
  - синтаксис объявления метода или свойства
  - [модификаторы] [val|fun|var] имя: возвращаемыйТип [= значение]
  - модификаторы: public, private, protected, default (package private) и нововведенный котлиновский internal (fyi: которого в java НЕТ)
    - internal - промежуточный модификатор между private и public
    - элемент виден во всех частях одного и того же модуля (проекта)
  - fun - ключ слово для объявления функции
  - имя - название метода или свойства
  - возвращаемыйТип - тип возвращаемого значения метода или типа свойства
    - val lazyValue: String by lazy { ... }
    - тут объявление неизменяемого свойства(переменной) lazyValue типа String
    - значение которого будет вычислено "ленивым" способом
    - добавление val к методу lazyValue означает, что это свойство (переменная), а не метод. Оно является неизменяемым и его значение будет вычислено только при первом обращении к нему
    - а в Java для ленивой загрузки нужна библиотека с аннотацией @Lazy

Функции _ в котлине есть методы и функции (fyi: в java функций НЕТ)
  - функции это тот же метод, находящий вне класса
  - НО при этом есть мнение, что методы в котлин это есть (называются) как "НЕ статические функции", а просто функции это "статические функции"
  - таким образом как бы заявляют, что в котлине нет методов а есть ток функции статические и НЕ статические (что несколько ломает, привычную логику Джависта в том что и как называть.)

Лямбда-выражения
- Java: (a, b) -> a + b
- Kotlin: { a, b -> a + b }

Циклы
- Java: for (int i = 0; i < 10; i++) { ... }
- Kotlin: for (i in 0 until 10) { ... } или for (item in list) { ... }
- если метод ничего не возвращает, тогда используют ключевое слово fun (вместо void)

Интерполяция (конкатенация) строк
- Java: "Hello, " + name + "!"
- Kotlin: "Hello, $name!"

"Расширение функций"
- Java: Отсутствует (ReflectionAPI есть и др пути обхода)
- Kotlin: fun String.lastChar(): Char { return this[this.length - 1] }
  - полезно когда мы хотим добавить к классу String новую функцию, которая возвращает последний символ строки.
  - lastChar() - это новый метод класса String
  - this - ссылается на оюъект класса String к котоому применяется метод
  - результат можем вызвать метод listChar на любом объекте класса String

## (синтаксический) Котлинов сахар
Добавление элементов в список
- Java: List<String> myList = new ArrayList<>(); myList.add("item");
- Kotlin: val myList: MutableList<String> = mutableListOf() myList += "item"
  - добавлять можно как в Java с явным указанием add() и без те через "+"
