package io.github.stavshamir.springwolf.asyncapi.types;

import com.asyncapi.v2.binding.OperationBinding;
import lombok.*;

import java.util.Map;

/**
 * Holds information about a producer channel.
 * All fields must be set and not null.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProducerData {

    /**
     * The name of the channel (topic, queue etc.).
     */
    private String channelName;

    /**
     * The class object of the payload published by this producer.
     */
    private Class<?> payloadType;

    /**
     * The binding of the producer.
     * <br>
     * For example:
     * <code>
     *     ImmutableMap.of("kafka", new KafkaOperationBinding())
     * </code>
     */
    private Map<String, ? extends OperationBinding> binding;

}
