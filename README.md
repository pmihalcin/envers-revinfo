Run `PersonTest` to reproduce the issue with Envers:

```
Caused by: org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException: NULL not allowed for column "REV"; SQL statement:
insert into revinfo (rev, revtstmp) values (null, ?) [23502-200]
	at org.h2.message.DbException.getJdbcSQLException(DbException.java:459)
	at org.h2.message.DbException.getJdbcSQLException(DbException.java:429)
	at org.h2.message.DbException.get(DbException.java:205)
	at org.h2.message.DbException.get(DbException.java:181)
	at org.h2.table.Column.validateConvertUpdateSequence(Column.java:374)
	at org.h2.table.Table.validateConvertUpdateSequence(Table.java:845)
	at org.h2.command.dml.Insert.insertRows(Insert.java:187)
	at org.h2.command.dml.Insert.update(Insert.java:151)
	at org.h2.command.CommandContainer.executeUpdateWithGeneratedKeys(CommandContainer.java:272)
	at org.h2.command.CommandContainer.update(CommandContainer.java:191)
	at org.h2.command.Command.executeUpdate(Command.java:251)
	at org.h2.jdbc.JdbcPreparedStatement.executeUpdateInternal(JdbcPreparedStatement.java:191)
	at org.h2.jdbc.JdbcPreparedStatement.executeUpdate(JdbcPreparedStatement.java:152)
	at com.zaxxer.hikari.pool.ProxyPreparedStatement.executeUpdate(ProxyPreparedStatement.java:61)
	at com.zaxxer.hikari.pool.HikariProxyPreparedStatement.executeUpdate(HikariProxyPreparedStatement.java)
	at org.hibernate.engine.jdbc.internal.ResultSetReturnImpl.executeUpdate(ResultSetReturnImpl.java:197)
	... 115 more
```
