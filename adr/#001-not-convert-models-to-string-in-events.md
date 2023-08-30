# Title

Creation date: 2023-08-30

## Status

Accepted

## Context

I wanted to prepare my app to be ready for microservices. But for now it is created to be modular monolith. So some
improvements can be done later.

## Decision

I will send not JSON String, but full objects in events for now. It is quicker. Using JSON String is over-engineering 
for current state of project.

## Consequences

Pros:
- quicker development
- not over-engineered project

Cons:
- it has to be done later when going microservices
