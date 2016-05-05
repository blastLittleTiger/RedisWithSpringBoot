# SpringBoot- Redis as cache
Sample project which shows Redis in action as web service response caching


<h4>Installation and Getting Started</h4>

<ul>
<li>
1. Clone this repo and import this project in Spring Tool Suite. You can download and install Spring Tool Suite from <a href="https://spring.io/tools/sts/all" target="_blank">here</a>.
</li>
<li>
2. If you are getting any error symbol in imported project, then update project using 'Maven'.
</li>
<li>
3. Run the project by right clicking on project, Run As -> Run on Server.
</li>
<li>
4. Open RestController.java file present in com.zishan.spring package. You can see request mapping of class and methods in this file. So, now you can assess the web services like returnIncrementedValue and updateCachedValue. In 'returnIncrementedValue' service, you need to pass an inital value and you will get an incremented value in response. Also if you will see the console or log, you will get 'Incremented value' print. But if you will invoke the service again, then it will neither increment the value nor you will get any print. On first request, redis cached the service result with the key as inital value which we passed and now it will return the result from cache. To update the value invoke 'updateCachedValue' service with inital value and new value.
</li>
</ul>
