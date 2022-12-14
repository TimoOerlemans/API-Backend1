## Portfolio

Here I go through all the learning outcomes that I need to prove so I go to the next semester.

## Table of contents
- [Outcome 1 You design and build user-friendly, full-stack web applications. (IP & GP)](#outcome-1-you-design-and-build-user-friendly-full-stack-web-applications-ip--gp)
- [Outcome 2 You use software tooling and methodology that continuously monitors and improve the software quality during software development. (IP)](#outcome-2-you-use-software-tooling-and-methodology-that-continuously-monitors-and-improve-the-software-quality-during-software-development-ip)
- [Outcome 3 You can implement the software process for your project according to a given agile software development method. (GP)](#outcome-3-you-can-implement-the-software-process-for-your-project-according-to-a-given-agile-software-development-method-gp)
- [Outcome 4 You implement a (semi)automated software release process that matches the needs of the project context. (IP)](#outcome-4-you-implement-a-semiautomated-software-release-process-that-matches-the-needs-of-the-project-context-ip)
- [Outcome 5 You recognize and take into account cultural differences when working with multi-site teams and are aware of ethical aspects in software development. (GP)](#outcome-5-you-recognize-and-take-into-account-cultural-differences-when-working-with-multi-site-teams-and-are-aware-of-ethical-aspects-in-software-development-gp)
- [Outcome 6 You translate (non-functional) requirements to extend existing (architectural) designs and can validate them using multiple types of test techniques. (GP)](#outcome-6-you-translate-non-functional-requirements-to-extend-existing-architectural-designs-and-can-validate-them-using-multiple-types-of-test-techniques-gp)
- [Outcome 7 You can explain simple business processes and relate them to the development of your software project. (GP)](#outcome-7-you-can-explain-simple-business-processes-and-relate-them-to-the-development-of-your-software-project-gp)
- [Outcome 8 You act in a professional manner during software development and learning. (IP & GP)](#outcome-8-you-act-in-a-professional-manner-during-software-development-and-learning-ip--gp)
- [STARRT](#STARR-T)

## Learning outcomes

## Outcome 1. You design and build user-friendly, full-stack web applications. (IP & GP)

I think I am standing for this LO on beginning because in my readme file you can see my research on frameworks. After these descicions I want to learn how to work with these frameworks so I have done a few tutorials. And now I apply them in my own project ,but I think not enough to be on the proficient. 

#### design

For my individual project I made a few Wireframes so I have an idea of how my app looks.

<img width="619" alt="image" src="https://user-images.githubusercontent.com/99472273/157846511-3fdd8502-d0fb-4ad9-b18a-b72c0dc9a345.png">

For this lo I think I have to make some design for my application, do research for what kind of framework to use, make a final product and then test it on people who have not seen the product(so that I can see if they can go through my application without getting stuck). Also have to look at distributed software system and how to store and where to store it.

To become on Proficient for this lo I need to build my application, test it on a user and document all of this.

For my ux I went to two persons who didn't know anything I had made or how it worked. I let them go through my website 
and just give me feedback of what was good and what was not that good or where they hang tight. They thought these things
where good: the letters where big enough so they could read everything well. All the important buttons were differently 
colored then the rest, so they stood out. They also thought that the layout was almost in every page good. They came up 
with some ideas, so I could improve my website: the fields for a new pizza could be more taken care of. In the update pizza 
was the card not in the middle and the image in the header and footer was gone. 

[start](https://spring.io/quickstart)

[more](https://spring.io/guides)

[React starting](https://reactjs.org/docs/getting-started.html#learn-react)

[More Wireframes](https://github.com/TimoOerlemans/Portfolio-Research/blob/main/README.md#wireframes)

[Framework research](https://github.com/TimoOerlemans/Portfolio-Research/blob/main/Research.md#Framework)

## Outcome 2. You use software tooling and methodology that continuously monitors and improve the software quality during software development. (IP)

For this lo I think I have to choose which type of testing I need for my project and I need to do the DOT research(security) for this lo. I can also ask someone to check my code before I merge it into the master branch for a review.  
I think I am on beginning because I know what to do and what I need but have not done the tests.

### Testing
Tests are done to continuously monitorise if the code works as supposed to. You have different types of test like unit test and integration test. The difference between those two is that unit test: focuses on one single function while integration tests are focused on combining functions.

There are a few functions in my application that gets used more than others. So not every function needs te be tested as
much as another. The functions add, delete product are mostly used by a user so that is what I tested the most. Besides, that
the other functions of a product must be tested to see if everything works as supposed to. That is why I made 3 unit tests 
for these functions and 2 integration test for the add and delete functions. After I made the back-end tests I wrote some 
front-end tests in the form of render tests and end-to-end tests. In the render tests I tested if a component renders well
in the browser. For the end-to-end test I tested if the new page came up correct if I filled it in wright.

#### Unit testing

I am going to create multiple unit tests to know if my functions are working as they supposed to do. I am going to do that by making test that should be right and wrong. The methods I am going to test are my read, create and delete methods in the back-end. I want to test these methods because they are used the most and that is way I need them to work.

#### Integration testing

For these tests I am going to use [Mockmvc](https://howtodoinjava.com/spring-boot2/testing/spring-boot-mockmvc-example/). This Mockmvc allows me to create fake request to the controller. I am going to write 2 intergration tests. One is going to make sure i get all my products and the other is for my deleting. I choose those two because they are the most used in my application.

#### Performance

For my performance I used lighthouse to test my front-end. It generates a report where you can see how the performance and 
other things are. At first, I had a bad performance that was because I had a few big pictures that could be a lot smaller, 
so it renders faster. Lighthouse also looks at accessibility, best practices and SEO. All three of those I stood on 92+ out 
of 100. 

#### Security 

For security, I implemented sonarqube because in sonarqube it says what can be better for the quality and security. So for 
this lo I needed to implement sonarqube and in sonarqube is a dashboard where is says what can be improving. My security had 3
vulnerabilities in the controllers. It gave me an option to improve these vulnerabilities, namely to replace that persistent entity
 with a simple DTO object. 

[Security Research](https://github.com/TimoOerlemans/Portfolio-Research/blob/main/Research.md#6-Security)


## Outcome 3. You can implement the software process for your project according to a given agile software development method. (GP)

This lo is about agile working. I need to understand what agile working is and implement it into my groups project.

In the groups project we use an agile way of working based on SCRUM. We do daily stand-ups, stand-downs and Peer review so everybody can say something about everyone. We also work in sprints of three weeks were we divide tasks to everyone in each sprint. 

We have tried different programs to use scrum ,but now we use only 2 programs: Github and Trello. In github are our projectboards and sprintbacklogs but in trello we have our burndownchart. 

Scrum is not the only agile methodology there are many more like XP(Extreme programming). The people who developed this way of working described it as "a humanistic discipline of software development, based on principles of simplicity, communication, feedback, and courage". XP is really focussed on just coding. They do something controversial to what almost to none other agile method uses and that is "pair programming". This pair programming means that two people work on the same computer. 
Before I read this method I didn't know we kinda just this already because if we sometimes can't figure it out, we'll work on a piece together. There are some things that match and others don't. Like they also make first the user story's and put an index on them to see how difficult they are. With scrum they do something called plan-poker and give every story points to estimate the amount of work. But with XP they give the points on 3 different risk indexes(Integrality, Vulnerability, difficulty). There is also one big difference and that is that it is tested first and then made for real. That is something I have never done before and in my eyes it is something I don't want to do.

I think I am on proficient because I know what agile working is ,and we are using it in our groups project. I have asked another group how they use scrum and it looks a little like we use it but they use for the sprint-backlogs trello. This semester we have worked with scrum but maybe next semester I want to try to work with XP because it sounds like a good method to work with.

[XP](https://nl.wikipedia.org/wiki/Extreme_programming#Geschiedenis)

## Outcome 4. You implement a (semi)automated software release process that matches the needs of the project context. (IP)

This lo is about automated software. An example is that my application runs every test when you push this has something's to do with outcome 2(quality) because it makes sure that you know that all the test you made for this lo keep working. I am going to make pipelines for my ci/cd, one for the frontend and one for the backend. These pipelines make sure that my code is working as they suposed to. They build my project and after that they run all the test to see if they pass. I already have made a ci/cd for my backend but my docker is not working good enough so I need to fix that. After that I only need to make a ci/cd pipeline for my frontend to become on proficient. 

### 4.1 Automatic testing

Test insures you that your code is working in the way it is supposed to. So it is smart to run those tests everytime you make a change and push something. I am going to make a pipeline where that will be done for me everytime I push something to main.

#### Band-end

<img width="455" alt="image" src="https://user-images.githubusercontent.com/99472273/163126564-68762955-876f-4cf1-be31-62872aecebcb.png">

### 4.2 Docker

Docker is an open source platform for building, deploying and managing containerized applications. I am going to use docker to be able to automatically build and deploy my application on a push. 

<img width="326" alt="image" src="https://user-images.githubusercontent.com/99472273/163125884-07426d3d-4136-4fa5-8a32-ea1e2a99395c.png">

After this I only need to do is automatically deploy these images in a container. 


[CI/CD Research](https://github.com/TimoOerlemans/Portfolio-Research/blob/main/Research.md#4-cicd)

I think I am on beginning because I know what I have to do ,and it works almost ,but it's not complete. After I made a container from my images and see the container I stand on beginning according to me. And when I have tests and a front-end ci/cd I am on proficient.

## Outcome 5. You recognize and take into account cultural differences when working with multi-site teams and are aware of ethical aspects in software development. (GP)

Here I have to know how different type of culturals work(some culturals work different than other culturals).
[Here](https://github.com/TimoOerlemans/Portfolio-Research/blob/main/Research.md#5-cultural-differences-and-ethics) is my research on this LO.

We have also done a personality to see what every one is. Anwar came out as a leader. If we work in with the group and somebody has to say something or there has to be made a decision he is the only one who stands-up and says something. That is just his personality just like the personality of Julian who is an entertainer. Julian is almost always the spontaneous one and tries to get everyone with him.
Sometimes he is too distracted with that, that we have to make him focus on the project instead of other things. 

This semester I have learned how to work with other type of differences not only cultural but also personality. With the information
I got from this I want to improve my way to work with other people. So when there is someone with a leader personality that we 
let him do his thing but also say when he goes too hard. 

## Outcome 6. You translate (non-functional) requirements to extend existing (architectural) designs and can validate them using multiple types of test techniques. (GP)

For this Lo I need to make architectural designs, make requirements and test with different techniques. I think I am standing here on orienting bacause in my own project I have made some of the architectural designs and understand what they mean.

In my group project I participated in making user stories. In my individual project I have made multiple user stories. I made the C4 model that you can find in the readme file.

To validate our designs I used another site to see if we have missed something we didn't think of when we were making our user stories. At that moment I didn't realise I used a research strategy from the dot framework. There are 5 research strategies and one of them is library "Library research is done to explore what is already done and what guidelines and theories exist that could help you further your design.". There is an available product analysis link where stands exactly what I have done. Look at different product that have the same things we want to make.

For this lo I think I am on proficient because I made some architectural designs and requirements for the group- and individualproject. I have validate them using a research strategy from dot framework.

[User stories](https://github.com/TimoOerlemans/Portfolio-Research/blob/main/README.md#user-stories)

[C4 model](https://github.com/TimoOerlemans/Portfolio-Research/blob/main/README.md#c4-model)

[Library](https://ictresearchmethods.nl/Category:Library)

## Outcome 7. You can explain simple business processes and relate them to the development of your software project. (GP)

For this LO I did some research about what a business process is. I answered some questions about this topic and for the visuals I made two activity diagrams(first one before the software applied and the second with) with draw io.

I am standing on proficient because I know what a simple business process is and how it relates to my project. 

[Business research](https://github.com/TimoOerlemans/Portfolio-Research/blob/main/Research.md#3-business-processes)

## Outcome 8. You act in a professional manner during software development and learning. (IP & GP)

For this lo I am going try to use pomodoro and also I am going to make a projectboard where all my features stand that I need to make. And for my professional manner I need to show that I am able to communicate good with my team and stakeholders.

At the start of this semester I knew a bit of people who didn't work as much as other people because in my previous semester there were some people who did almost nothing. That semester I waited till the last few weeks to tell them that it needed to change. This semester I didn't waited that long and spoke to them that we needed a change. So we agreed to see each others work every day so we could see where everyone was working on and that every one was working.

I have used pomodoro on the individual days but came to a conclussion that sometimes it doesn't work for me and sometimes it does. When I am in a good working mood and it all works then I just want to stay working and don't want to pause. But when I am very distracted I need it to stay foccused. 

In the second sprint from the groupspoject we have used some feedback we recieved form the stakeholders. Like in the first sprint we didn't used the projectboard good and some other things but in the second sprint we did. After our second meeting with the stakeholders they asked if we did something with the feedback and we showed them this they were positive about this.

I think I am on Proficient because in the groupsproject we use a projectboard and have done a Peerpulse where we gave feedback to eachother what could be done better. I also show that I personally grew and changed how I reacted according to previous situations. 

<img width="545" alt="image" src="https://user-images.githubusercontent.com/99472273/159669126-d0111f9f-40ab-4ac2-be85-cb7052e68485.png">

## STARR(T)

#### Situation

We were recording the retrospective on april 21 and talked about what could be done better. The 3 weeks before that went pretty good because we could check everything off that we would do in those 3 weeks. But in my eyes not everyone was helping as much in the project. 

#### Task

My task in this conversation was just tell what I found about these 3 weeks. In those 3 weeks I worked mostly on the frontend. I made the account function in our application because that was an requirement from the stakeholders. Some others were working on the overview function (so you see all your information about a flight and accomodation). After I was done with my task I wanted to help someone else with there tasks. So I helped with the overview and made it work. 

#### Action

During those tasks some people did not work on something and were doing other things not related to the project. So I wanted to say something in the retrospective so I could see what they were doing during the time we were working. I didn't wanted to blame everything on them after just one sprint because they need the time to improve themself. 

#### Result

As an result we made an agreement that we were going to be more involved with eachother work. This is for now good but we will see it in the next sprint. If we continue to keep this promise it will work because then we can see more of what they are doing and say something quicker if they don't do anything. 

#### Reflection

For me the conversation went good and we made some promises that should keep this problem away. I think I did a good job in not immediatly being the one who is going for someones throat. I hope to see some better results in the next 3 weeks. The next time the one thing I would change about what I have done is that it needed to be said earlier. So they could change there behavior quicker and do some more work. 

#### Transfer
Next sprint I want to check some peoples work everyday so I can see that they are actually working. 
