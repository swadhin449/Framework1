set projectLocation=D:\Eclipse_Selenium\Selenium_NIT\Framework
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml