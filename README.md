# Google Maps Test

## Prerequisite
* JDK 17
* Maven 3.8.6
* compatible chromedriver inside src/main/resources

## How to run tests
There are couple ways to execute implemented tests depends on results you want to get
#### 1. Right click on "testng.xml" file and choose run -> Cucumber report
#### 2. Using terminal with "mvn clean test" command executed in project directory -> surefire report
#### 3. Running GoogleMapsTest.java class -> clean Selenium with DataProvider, no report

## Additional Work:
####1. Unhappy path could be implemented by using wrong input:
- empty or incomplete phrase, UPER/LOWER case, typos, doubled letters, mixed with numbers, mixed with special characters, wrongly coded characters,
- different language combinations browser to input
- geographic coordinates, postal code, in different variants

e.g. "", Pari, aris, PARIS, paris, PaRiS, pparis, Pari5, Par!s, ParyĹĽ, Londres, ロンドン, GV5F+8QP, "51.50844436303102, -0.12495393303961075", 51°30′30″N 0°07′32″W, WC2R 0EU
  
expected behavior should be defined by business
####2. Common libraries listed in pom.xml
####3. You are currently reading relevant README :-)
####4. There are several places for improvement - depends on agreemnt
####5. Cucumber report, surefire report, screenshots with Extent Reporting Framework -> TO DO
####6. Non-functional requirements:

- Page Load Times:

To measure performance we can use tools like Apache JMeter, LoadRunner, or compare execution time from reports. Analyze network traffic with browser developer tools or network monitoring tools to identify any performance bottlenecks. Set performance benchmarks and compare the actual page load times against the defined targets.

- API Performance:

Tools like JMeter, Postman, or Gatling to load test APIs and measure their response times, throughput, and scalability using different data sets, payloads, and load conditions to identify any performance issues.

- Accessibility Testing:

There are some automated accessibility  testing tools like Axe, pa11y, or WebAIM's Wave tool to identify accessibility issues. Try to conduct usability testing with individuals who have disabilities to gather feedback on accessibility aspects.

- Security Testing:

Follow OWASP directions, use ready out-of-the-box solution e.g. OWASP ZAP, Nessus, or Burp. Penetration testing