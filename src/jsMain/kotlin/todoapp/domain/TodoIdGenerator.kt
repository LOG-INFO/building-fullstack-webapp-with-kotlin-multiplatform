package todoapp.domain

actual interface TodoIdGenerator {
    // 직접 구현한 UUID 클래스
//    actual fun generateId() = TodoId(UUID.randomUUID().toString())
    actual fun generateId() = TodoId(external.uuid.v4())
}