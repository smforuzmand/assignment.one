###Topics:

• Collections

• Interfaces

• DAO pattern

• Sequencers

• Stream API - optional

• Singleton pattern – optional

• Generics – optional

• Serialization to JSON - optional


Overview:

In this project you need to implement central storage of your model objects. (AppUser, Person,
TodoItem and TodoItemTask) You are going to do this by applying the DAO pattern with help of
Collections. You are also going to make sequencers in order to be able to pass unique id’s to each
new object.


Requirements:

• Sequencers created according to specific requirements

• Interfaces AppUserDAO.class, PersonDAO.class, TodoItemDAO.class and
TodoItemTaskDAO.class implemented according to each specific requirement

Optional:

• Use singleton pattern for DAO implementing classes and sequencers

• Use Generics to simplify DAO interfaces

• Use the Stream API in implementing DAO classes

• Read / Write all objects from / to JSON file(s) when starting / ending application.

• Read / Write all sequencervalues from / to a properties file when starting / ending
application.