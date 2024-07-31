# Invoices API

## Description

A simple invoice management API using Spring Boot.

## User Roles

- Root: Can do everything but delete itself and reset its password without providing its current one.

- User: Can only perform CRUD ops on invoices.

## Notes

- Only the PostgreSQL driver is included by default.

- A React.js front end is available [here](https://github.com/agent-indigo/invoices-web).

- The Express.js with Sequelize version of this API is available [here](https://github.com/agent-indigo/invoices-api-js).
