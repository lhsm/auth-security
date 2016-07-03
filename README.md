# Auth Security
Contains authorization security for services

## Auth
Provides base authentication entities

## JWT
Provides authentication by Bearer JWT Token

## Auth Security
Provides base authentication spring security entities

## Dependency
    `<dependency>
        <groupId>com.github.lhsm.auth</groupId>
        <artifactId>auth-security</artifactId>
        <version></version>
        <type>pom</type>
        <scope>import</scope>
    </dependency>`

## Usage

* import JwtAuthConfig

* use AuthHolder to getting Authentication object

* import JwtAuthConfig, DefaultJwtWebSecurityConfig, JwtMethodSecurityConfig, used `Expression-Based Access Control`

* `@PreAuthorize("hasAuthority('10')")` to access operation 10 

* `@PreAuthorize("hasPermission(#personId, '')")` to access only current person 