package todoapp.domain

import java.util.UUID

actual interface TodoIdGenerator {
    actual fun generateId() = TodoId(UUID.randomUUID().toString())
}