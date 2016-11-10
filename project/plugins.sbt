resolvers += Resolver.url("sbt-plugin-releases", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.github.gseitz" % "sbt-release"     % "1.0.0")
addSbtPlugin("com.jsuereth"      % "sbt-pgp"         % "1.0.0")
addSbtPlugin("com.typesafe"      % "sbt-mima-plugin" % "0.1.8")
addSbtPlugin("com.typesafe.sbt"  % "sbt-ghpages"     % "0.5.2")
addSbtPlugin("com.typesafe.sbt"  % "sbt-osgi"        % "0.7.0")
addSbtPlugin("com.typesafe.sbt"  % "sbt-scalariform" % "1.3.0")
addSbtPlugin("org.xerial.sbt"    % "sbt-sonatype"    % "1.0")
addSbtPlugin("com.eed3si9n"      % "sbt-doge"        % "0.1.5")
