plugins {
    id("org.springframework.boot") version "2.7.2"
    id("io.spring.dependency-management") version "1.0.13.RELEASE"
    application
}

group = "ltr.org"
version = "Dev_1.0"
repositories {
    mavenCentral()
    mavenLocal()
}

var springbootDataEnvers = "2.7.2"
var springfox = "3.0.0"
var modelmapper = "3.1.0"
var commonLang = "3.12.0"
var commonIo = "2.11.0"
var logBack="6.4"
var commonCsv = "1.9.0"
var prometheus = "1.10.2"
var mockito = "5.2.0"
var springBatchTest = "5.0.1"
var springBatch = "4.3.6"
var fileUpload = "1.5"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation ("org.springframework.boot:spring-boot-starter-data-redis:$springbootDataEnvers")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.data:spring-data-envers:$springbootDataEnvers")
    implementation("io.springfox:springfox-boot-starter:$springfox")
    implementation("org.modelmapper:modelmapper:$modelmapper")
    implementation("org.apache.commons:commons-lang3:$commonLang")
    implementation("commons-io:commons-io:$commonIo")
    implementation("org.apache.commons:commons-csv:$commonCsv")
    implementation("net.logstash.logback:logstash-logback-encoder:$logBack")
    implementation(files("libs/common-config-dev.jar"))
    implementation("io.micrometer:micrometer-registry-prometheus:$prometheus")
    implementation("org.springframework.batch:spring-batch-core:$springBatch")
    implementation("commons-fileupload:commons-fileupload:$fileUpload")
    compileOnly("org.projectlombok:lombok")
    runtimeOnly("org.postgresql:postgresql")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")
    testImplementation("org.springframework.security:spring-security-test")
    testImplementation("org.mockito:mockito-inline:$mockito")
    testImplementation("org.springframework.batch:spring-batch-test:$springBatchTest")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}