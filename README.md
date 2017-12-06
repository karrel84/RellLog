# RellLog
로그 클래스

# 환경설정 - JitPack
* root build.gradle에 jitpack을 추가합니다.
```java
 allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
* app build.gradle의 dependencies에 라이브러리 주소를 추가합니다.
```java
	dependencies {
	        compile 'com.github.karrel84:RellLog:1.0.5'
	}
```

# 라이센스
 ```code
Copyright 2017 Karrel

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
