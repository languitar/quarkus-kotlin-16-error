package org.acme.getting.started

import java.util.UUID
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "Hello RESTEasy"

}

@Entity
@Table(name = "something")
class Foo(
    @Id
    var uuid: UUID,
) {
    fun uncommentToTrigger() = 42
}
