# object-oriented-robot
Collection resources about software design metrics.

Original [script](https://github.com/ZherebtsovAlexandr/object-oriented-robot/blob/master/depend.sh) by [Robert Martin](https://en.wikipedia.org/wiki/Robert_Cecil_Martin)

**Steps to take Object-oriented metrics by Robert Martin**

1. Download [Jdepend](https://github.com/clarkware/jdepend) and folow [instuction] (http://clarkware.com/software/JDepend.html) to build app
2. Create Jar [sample project] (https://github.com/ZherebtsovAlexandr/Object-oriented-robot/tree/master/sample/ObjectOrientedRobot) ([Quickly create Jar artifact for application](https://blog.jetbrains.com/idea/2010/08/quickly-create-jar-artifact/))
3. Run Jdepend to see [OO Metrics] (http://www.codeproject.com/Articles/1007524/Object-oriented-metrics-by-Robert-Martin) in graphical UI:

***UNIX***

`java -classpath path_to_jdepend_jar/jdepend-2.9.1.jar jdepend.swingui.JDepend path_to_sample_jar`

###repo in progress..

# Links

1. [Software package metrics](https://en.wikipedia.org/wiki/Software_package_metrics) 
2. [Object-oriented metrics by Robert Martin](http://www.codeproject.com/Articles/1007524/Object-oriented-metrics-by-Robert-Martin)
3. [OO Design Quality Metrics PDF](http://www.cin.ufpe.br/~alt/mestrado/oodmetrc.pdf)
4. [A Java package dependency analyzer that generates design quality metrics](https://github.com/clarkware/jdepend)
