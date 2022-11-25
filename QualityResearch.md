## Research

### Main question:

How can tooling improve software quality?

### Sub-questions

- [Which research strategy am I going to use for each sub question](#Which-research-strategy-am-I-going-to-use-for-each-sub-question)
- [What is software quality?](#1-what-is-software-quality)
- [What are tooling options?](#2-what-are-tooling-options)
- [What is the best option?](#3-what-is-the-best-option)
- [Conclusion](#Conclusion)


### Which research strategy am I going to use for each sub question

For each of the sub questions I am going to use a research strategy from the dot research framework. For the first 
question I want to use [literature study](https://ictresearchmethods.nl/Literature_study). It is about finding information
from the internet using keywords to search deeper and deeper. For the second question I want to use 
[available product analysis](https://ictresearchmethods.nl/Available_product_analysis). This is a strategy that 
is about looking at work from other people and see what they used. The last question I am going to use 
[document analysis](https://ictresearchmethods.nl/Document_analysis). 

### 1. What is software quality?

First we are going to look at what is now software quality. According to [this](https://en.wikipedia.org/wiki/Software_quality):
- Software functional quality reflects how well it complies with or conforms to a given design, based on functional requirements or specifications.
- Software structural quality refers to how it meets non-functional requirements that support the delivery of the functional requirements, such as robustness or maintainability.

In my own words: software quality is about how good the code is to maintain. So if you make code that is just everywhere,
and you use the wrong names to describe something that is bad. You want it to be simple and clear. I also think that you 
to test everything that you can test and not just 1 type of test but multiple. So you can test on different levels in your
application. 

We want good software quality because if we need to change the project later, then it has to be uncluttered. Someone who
didn't work on the project from the start should be able to read the documentation and the code in a few hours or so and 
understand what everything is. It also needs to be of good quality because when you are done with the project and after just
one week the code doesn't work then they need to pay somebody who checks every piece of code. 

The quality of our code can be tested by test that you write. There are so many kind of test that you don't need to use 
them all. But there are some test that are better for each piece. You don't need to test 30 different test on 1 function.
You want to spread them about the code so that you know that everything will work as supposed so.

### 2. What are tooling options?

[Here](https://www.softwaretestinghelp.com/tools/top-40-static-code-analysis-tools/) is a site with the best static code analysis tools.
The top 3 tools according from that are: Deep source, SonarQube and PVS-studio. For this sub question I am going to compare these three
with each other to see what every tooling does. 

#### [Deep source](https://deepsource.io/)

Deep source is a tool that analysis your code. It looks at the quality and security of it. They are a compliance in the top 
10 of OWASP(pen Web Application Security Project). It works on multiple tooling such as GitHub, gitlab and bitbucket. 
The performance is of great quality with just a 2.8% of false rated positive issues. 

#### [SonarQube](https://www.sonarqube.org/)

SonarQube is one of the most popular tooling for static code analysis. Here you have 4 packages you can choose as 
edition(Community, Developer, Enterprise and Data Center). Each edition has its own pro's and cons, but I am going to look 
at the community edition. This edition Supports 17 different languages and 50+ community plugins. You can also use this
on GitHub, gitlab and bitbucket. SonarQube can be implemented in a ci/cd, and it gives you an overview of the changes and
corresponding results.

### [PVS-studio](https://pvs-studio.com/en/)

PVS-studio is a static code analysis tool for 3 different languages(C, C++, C# and Java). PVS detects all kinds of errors-typos,
dead code and other things. After that an analyzer says what you can do instead of what you have. You can integrate PVS into all
kinds of IDE's and even with SonarQube.

### 3. What is the best option?

I am going to compare these 3 tools and look how much each one of these is used. The things I am going to compare these on 
are: can I find a lot of documentation, when is the last update, how much is it used.

Deep source: the documentation looks good on their own website, but if you search outside their own website then I found
almost nothing that helped me. Their tooling get updated sometimes so their tooling is always up-to date. As I said about 
their documentation I couldn't found much about it getting used by other people. 

SonarQube: the documentation is for me a little confusing, but other than deep source. I could find a lot of information
on the internet other than their own site. When I searched for static code analysis almost every site or video used SonarQube.
Their tooling is also up-to date and gets almost every month updated. What I already said was that a lot of people uses 
this tooling for their own.

PVS-studio: Just as deep source is the documentation good on their own website. They guide you step by step to start your 
own static code analysis. I couldn't find much about their releases so that is a bit tricky. But just like the deep source,
if I searched on the internet there was not a lot of people who used this.


### Conclusion

The conclusion is that tooling can improve your software because it sees error, dead code and security leaks that people doesn't always see.
The tooling you use depends on what you are using and what you like because they are all good in their own way. 