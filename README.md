# Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
	
# Step 2. Add the dependency
## For Public Android APP

```gradle
dependencies {
    compile 'com.github.conanchen.hiask-api-sexyimage:grpc-public-javalite:1.0.0-SNAPSHOT'
}
```
	
##For Manager Android APP

```gradle
dependencies {
    compile 'com.github.conanchen.hiask-api-sexyimage:grpc-manage-javalite:1.0.0-SNAPSHOT'
}
```
	
## For Java Application
    
```gradle
dependencies {
    compile 'com.github.conanchen.hiask-api-sexyimage:grpc-manage-java:1.0.0-SNAPSHOT'
}
```
			