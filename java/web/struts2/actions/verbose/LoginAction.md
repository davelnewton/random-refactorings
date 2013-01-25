# Getters/setters

Struts 2 requires a setter to get form data into the action.

Conventional wisdom indicates that the getters and setters should always be used to access those properties. In this case, I'm ambivalent, since it's *extrememly* unlikely the getters will ever change.

# Additional boolean

There appear to be two booleans serving the same purpose: holding the success/failure of logging in. I don't see the point.

# Not using the framework

The framework already provides a way to get messages to the view layer; I don't know as it's necessary to expose a flag in order to control view layer logic, particularly in this case, since the error page only needed to display a message.

(And the presence of those messages can be discovered on the JSP side in a couple of ways. OTOH, it *would* be nice to have a generic "Are there any errors?" and "Are there any messages?" flag without checking the size of the error/message collection.)

# UserService

To make testing easier.
