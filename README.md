## Swarm

# dev
run:
+ mvn package
+ java jar <args>
to debug add vm arg:

+ -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005

+ on intellij add remote config:

 -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005