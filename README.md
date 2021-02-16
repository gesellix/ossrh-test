# ossrh-test

Sandbox to show an automated publish/release process to Maven Central via [gradle-nexus/publish-plugin](https://github.com/gradle-nexus/publish-plugin)
after JFrog's announcement about [the shutdown of Bintray/JCenter/...](https://jfrog.com/blog/into-the-sunset-bintray-jcenter-gocenter-and-chartcenter/).

## Release Workflow

There are multiple GitHub Action Workflows for the different steps in the package's lifecycle:

- CI: Builds and checks incoming changes on a pull request
  - triggered on every push to a non-default branch
- CD: Publishes the Gradle artifacts to GitHub Package Registry
  - triggered only on pushes to the default branch
- Release: Publishes Gradle artifacts to Sonatype and releases them to Maven Central
  - triggered on a published GitHub release using the underlying tag as artifact version
