
[toc]
#1.构造注入

###接口
Animal    方法--->Hello()

CallType    方法---->callTest()
###实体类
cat       无参+有参     属性--->call    继承---->Animal

Yell       无参  属性--->callType    继承---->callTest
 #####xml配置
```
<bean id="cat" class="com.xiaohe.entity.Cat">
        <property name="call">
            <ref bean="yell"></ref>
        </property>
    </bean>
    <bean id="yell" class="com.xiaohe.entity.Yell"></bean>
```
#2构造注入
#####在实体类Cat中  加有参构造方法
```
    public Cat(CallType call){
        this.call = call;
    }
```
#####xml配置
```
    <bean id="cat" class="com.xiaohe.entity.Cat">
      <constructor-arg>
          <ref bean="yell"></ref>
      </constructor-arg>
    </bean>
    <bean id="yell" class="com.xiaohe.entity.Yell"></bean>
```

#集合注入（String,list,set,map,properties）
####实体类
TyepDemo    String,list,set,map,properties --->set,get方法

#### xml配置
```
    <bean id="typeDemo" class="com.xiaohe.entity.TypeDemo">
        <property name="string" value="xiaohe "></property>
        <property name="list">
            <list>
                <value>xiaohe1</value>
                <value>xiaohe2</value>
            </list>
        </property>
        <property name="set">
            <set>
                <value>xiaohe3</value>
                <value>xiaohe4</value>
            </set>
        </property>
        <property name="map">
            <map>
                <entry key="1" value="xiaohe5"></entry>
                <entry key="2"><value>xiaohe6</value></entry>
            </map>
        </property>
        <property name="properties">
            <props>
                <prop key="1">xiaohe7</prop>
                <prop key="2">xiaohe8</prop>
            </props>
        </property>
    </bean>
```
# null值的处理(<null>)
```
 <property name="list">
            <list>
                <value>null</value>  //第一种
                <null>  //第二种
            </list>
        </property>
```
#使用依赖(depends-on)
######概念
depends-on标签表示该bean初始化之前强制执行执行指定的一个或多个bean初始化
```
    <bean id="yell" class="com.xiaohe.entity.Yell"></bean>
    <bean id="cat" class="com.xiaohe.entity.Cat" depends-on="yell">
      <constructor-arg>
          <ref bean="yell"></ref>
      </constructor-arg>
    </bean>
```
#延迟初始化Bean （lazy-init="true"）
####概念
使用某个bean的时候才将它初始化
```\
    <bean id="yell" class="com.xiaohe.entity.Yell"></bean>
    <bean id="cat" class="com.xiaohe.entity.Cat" lazy-init="true">
      <constructor-arg>
          <ref bean="yell"></ref>
      </constructor-arg>
    </bean>
   
```
#Bean的生命周期(init-method="init"   销毁destory-method="close")
##### 初始化
```
实体类   Hello
            
        Message
        
```

#####xml配置
```
    <bean id="message" class="com.xiaohe.entity.Message"></bean>
    <bean id="hello" class="com.xiaohe.entity.Hello" init-method="init">
        <property name="message" ref="message"></property>
    </bean>
```

######销毁
#####实体类
hello2

#####xml配置
```
    <bean id="hello2" class="com.xiaohe.entity.Hello2" destroy-method="close">
        <property name="message" ref="message"></property>
    </bean>

```
#bean的五种装配模式
1.no
2.buName
3.buType
4.Constructor
5.autodetect