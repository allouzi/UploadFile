
<h2><a id="spring-boot-file-upload" class="anchor" aria-hidden="true" href="#spring-boot-file-upload"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Spring Boot File Upload </h2>

<p><img src="https://github.com/uploadcare/uploadcare-java/actions/workflows/maven.yml/badge.svg?branch=master" alt="Build Status" style="max-width:100%;"> </a>
<a href="https://mvnrepository.com/repos/central"><img src="https://camo.githubusercontent.com/8d63c8824b612a84c02dc97642296b8a52a04479d550972e5a6439278aeaf839/68747470733a2f2f6d6176656e2d6261646765732e6865726f6b756170702e636f6d2f6d6176656e2d63656e7472616c2f636f6d2e75706c6f6164636172652f75706c6f6164636172652f62616467652e737667" alt="Maven Central" data-canonical-src="https://maven-badges.herokuapp.com/maven-central/com.uploadcare/uploadcare/badge.svg" style="max-width:100%;"></a>
<a href="https://docs.oracle.com/en/java/"><img src="https://camo.githubusercontent.com/318c65006d7686df6805b050a0be75dacbb634c5c1ba844618577fe7e835b182/68747470733a2f2f7777772e6a617661646f632e696f2f62616467652f636f6d2e75706c6f6164636172652f75706c6f6164636172652e737667" alt="Javadocs" data-canonical-src="https://www.javadoc.io/badge/com.uploadcare/uploadcare.svg" style="max-width:100%;"></a>


  <p><strong>Tutorial</strong>: <a href="https://www.callicoder.com/spring-boot-file-upload-download-rest-api-example/" rel="nofollow">Upload/Download files with Spring Boot REST API</a></p>
  
  <h2><a id="user-content-steps-to-setup" class="anchor" aria-hidden="true" href="#steps-to-setup"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Steps to Setup</h2>
  <p><strong>1. Clone the repository</strong></p>
  <div class="highlight highlight-source-shell position-relative"><pre>git clone https://github.com/allouzi/UploadFile.git</pre><div class="zeroclipboard-container position-absolute right-0 top-0">
    <clipboard-copy aria-label="Copy" class="ClipboardButton btn js-clipboard-copy m-2 p-0 tooltipped-no-delay" data-copy-feedback="Copied!" data-tooltip-direction="w" value="git clone https://github.com/allouzi/UploadFile.git
" tabindex="0" role="button">
      <svg aria-hidden="true" viewBox="0 0 16 16" version="1.1" data-view-component="true" height="16" width="16" class="octicon octicon-clippy js-clipboard-clippy-icon m-2">
    <path fill-rule="evenodd" d="M5.75 1a.75.75 0 00-.75.75v3c0 .414.336.75.75.75h4.5a.75.75 0 00.75-.75v-3a.75.75 0 00-.75-.75h-4.5zm.75 3V2.5h3V4h-3zm-2.874-.467a.75.75 0 00-.752-1.298A1.75 1.75 0 002 3.75v9.5c0 .966.784 1.75 1.75 1.75h8.5A1.75 1.75 0 0014 13.25v-9.5a1.75 1.75 0 00-.874-1.515.75.75 0 10-.752 1.298.25.25 0 01.126.217v9.5a.25.25 0 01-.25.25h-8.5a.25.25 0 01-.25-.25v-9.5a.25.25 0 01.126-.217z"></path>
</svg>
      <svg aria-hidden="true" viewBox="0 0 16 16" version="1.1" data-view-component="true" height="16" width="16" class="octicon octicon-check js-clipboard-check-icon color-text-success d-none m-2">
    <path fill-rule="evenodd" d="M13.78 4.22a.75.75 0 010 1.06l-7.25 7.25a.75.75 0 01-1.06 0L2.22 9.28a.75.75 0 011.06-1.06L6 10.94l6.72-6.72a.75.75 0 011.06 0z"></path>
</svg>
    </clipboard-copy>
  </div></div>
  <p><strong>2. Change the connection string and the container in the "application.properties".</strong></p>

 <p>azstorage.STORAGE_CONNECTION_STRING= XXX </p>
 <p>azstorage.CONTAINER_NAME= XXX </p>


  <h3 class="sr-only">Topics</h3>
  <div class="mt-3">
      <div class="f6">
      <a data-ga-click="Topic, repository page" data-octo-click="topic_click" data-octo-dimensions="topic:rest" href="/topics/rest" title="Topic: rest" data-view-component="true" class="topic-tag topic-tag-link">
  rest
</a>
      <a data-ga-click="Topic, repository page" data-octo-click="topic_click" data-octo-dimensions="topic:spring" href="/topics/spring" title="Topic: spring" data-view-component="true" class="topic-tag topic-tag-link">
  spring
</a>
      <a data-ga-click="Topic, repository page" data-octo-click="topic_click" data-octo-dimensions="topic:spring-boot" href="/topics/spring-boot" title="Topic: spring-boot" data-view-component="true" class="topic-tag topic-tag-link">
  spring-boot
</a>
      <a data-ga-click="Topic, repository page" data-octo-click="topic_click" data-octo-dimensions="topic:file-upload" href="/topics/file-upload" title="Topic: file-upload" data-view-component="true" class="topic-tag topic-tag-link">
  file-upload
</a>
      <a data-ga-click="Topic, repository page" data-octo-click="topic_click" data-octo-dimensions="topic:spring-mvc" href="/topics/spring-mvc" title="Topic: spring-mvc" data-view-component="true" class="topic-tag topic-tag-link">
  spring-mvc
</a>
      <a data-ga-click="Topic, repository page" data-octo-click="topic_click" data-octo-dimensions="topic:file-download" href="/topics/file-download" title="Topic: file-download" data-view-component="true" class="topic-tag topic-tag-link">
  file-download
</a>
  </div>
      </div>
</div>
<br/><br/>

<p><strong>3. Run the app using maven</strong></p>
<div class="highlight highlight-source-shell position-relative"><pre><span class="pl-c1">cd</span> UploadFile
mvn spring-boot:run</pre><div class="zeroclipboard-container position-absolute right-0 top-0">
    <clipboard-copy aria-label="Copy" class="ClipboardButton btn js-clipboard-copy m-2 p-0 tooltipped-no-delay" data-copy-feedback="Copied!" data-tooltip-direction="w" value="cd UploadFile
mvn spring-boot:run
" tabindex="0" role="button">
      <svg aria-hidden="true" viewBox="0 0 16 16" version="1.1" data-view-component="true" height="16" width="16" class="octicon octicon-clippy js-clipboard-clippy-icon m-2">
    <path fill-rule="evenodd" d="M5.75 1a.75.75 0 00-.75.75v3c0 .414.336.75.75.75h4.5a.75.75 0 00.75-.75v-3a.75.75 0 00-.75-.75h-4.5zm.75 3V2.5h3V4h-3zm-2.874-.467a.75.75 0 00-.752-1.298A1.75 1.75 0 002 3.75v9.5c0 .966.784 1.75 1.75 1.75h8.5A1.75 1.75 0 0014 13.25v-9.5a1.75 1.75 0 00-.874-1.515.75.75 0 10-.752 1.298.25.25 0 01.126.217v9.5a.25.25 0 01-.25.25h-8.5a.25.25 0 01-.25-.25v-9.5a.25.25 0 01.126-.217z"></path>
</svg>
      <svg aria-hidden="true" viewBox="0 0 16 16" version="1.1" data-view-component="true" height="16" width="16" class="octicon octicon-check js-clipboard-check-icon color-text-success d-none m-2">
    <path fill-rule="evenodd" d="M13.78 4.22a.75.75 0 010 1.06l-7.25 7.25a.75.75 0 01-1.06 0L2.22 9.28a.75.75 0 011.06-1.06L6 10.94l6.72-6.72a.75.75 0 011.06 0z"></path>
</svg>
    </clipboard-copy>
  </div></div>
  <p>That's it! The application can be accessed at <code>http://localhost:8080</code>.</p>
  <p>You may also package the application in the form of a jar and then run the jar file like so -</p>
  <div class="highlight highlight-source-shell position-relative"><pre>mvn clean package
java -jar target/uploadfile-0.0.1-SNAPSHOT.jar</pre><div class="zeroclipboard-container position-absolute right-0 top-0">
    <clipboard-copy aria-label="Copy" class="ClipboardButton btn js-clipboard-copy m-2 p-0 tooltipped-no-delay" data-copy-feedback="Copied!" data-tooltip-direction="w" value="mvn clean package java -jar target/uploadfile-0.0.1-SNAPSHOT.jar

" tabindex="0" role="button">
      <svg aria-hidden="true" viewBox="0 0 16 16" version="1.1" data-view-component="true" height="16" width="16" class="octicon octicon-clippy js-clipboard-clippy-icon m-2">
    <path fill-rule="evenodd" d="M5.75 1a.75.75 0 00-.75.75v3c0 .414.336.75.75.75h4.5a.75.75 0 00.75-.75v-3a.75.75 0 00-.75-.75h-4.5zm.75 3V2.5h3V4h-3zm-2.874-.467a.75.75 0 00-.752-1.298A1.75 1.75 0 002 3.75v9.5c0 .966.784 1.75 1.75 1.75h8.5A1.75 1.75 0 0014 13.25v-9.5a1.75 1.75 0 00-.874-1.515.75.75 0 10-.752 1.298.25.25 0 01.126.217v9.5a.25.25 0 01-.25.25h-8.5a.25.25 0 01-.25-.25v-9.5a.25.25 0 01.126-.217z"></path>
</svg>
      <svg aria-hidden="true" viewBox="0 0 16 16" version="1.1" data-view-component="true" height="16" width="16" class="octicon octicon-check js-clipboard-check-icon color-text-success d-none m-2">
    <path fill-rule="evenodd" d="M13.78 4.22a.75.75 0 010 1.06l-7.25 7.25a.75.75 0 01-1.06 0L2.22 9.28a.75.75 0 011.06-1.06L6 10.94l6.72-6.72a.75.75 0 011.06 0z"></path>
</svg>
    </clipboard-copy>
  </div></div>
  
