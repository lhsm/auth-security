# Auth Security
Provides base authentication spring security entities

## Usage
* import JwtAuthConfig, AuthWebSecurityConfig, AuthMethodSecurityConfig, use `Expression-Based Access Control` 

* `@PreAuthorize("hasAuthority('10')")` to access operation 10 

* `@PreAuthorize("hasPermission(#personId, '')")` to access only current person 